Moon	"Luci/Lucernis I I"
{
	ParentBody     "Verna-Luci bar"
	Class          "Carbonia"
	Mass            0.0119
	Radius          1.63e+03
	InertiaMoment   0.373
	RotationOffset  -90
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	EndogenousHeating 12.3
	AlbedoBond      0.07
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.625 0.532 0.437)

	Surface
	{
		Preset         "lercurnis_verna_luci.cfg"
		SurfStyle       0.98
		Randomize      (0.822, 0.796, -0.431)
		colorDistMagn   0.0739
		colorDistFreq   233
		detailScale     64
		drivenDarkening 0.572
		seaLevel        0.351
		snowLevel       2
		tropicLatitude  0.525
		icecapLatitude  1.1
		icecapHeight    0
		climatePole     0.938
		climateTropic   0.313
		climateEquator  0.688
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.105
		heightTempGrad  0.625
		beachWidth      0.000873
		tropicWidth     0.07
		mainFreq        1.71
		venusFreq       0.885
		venusMagn       0.649
		mareFreq        0.001
		mareDensity     1
		terraceProb     0.168
		erosion         0
		montesMagn      0.1
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       7.18
		dunesFreq       9.24e+04
		dunesFraction   1
		hillsMagn       2
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      61.4
		riversFreq      3.72
		riversSin       10
		riftsMagn       15
		riftsFreq       10
		riftsSin        10
		eqridgeMagn     0.365
		eqridgeWidth    0.0228
		eqridgeModMagn  2.5
		eqridgeModFreq  10
		canyonsMagn     0
		canyonsFreq     0
		canyonsFraction 0.87
		cracksMagn      0.03
		cracksFreq      0.2
		cracksOctaves   15
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   20
		craterRayedFactor 0
		volcanoMagn     0.519
		volcanoFreq     2
		volcanoDensity  0.0992
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.45
		volcanoTemp     870
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.399
		RoughnessIce    0.234
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		TempMapMaxTemp  6.55e+04
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

	Climate
	{
		GlobalWindSpeed  0
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      40.0483178
		SemiMajorAxisKm 833723.112
		Eccentricity    0.106870229
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 180
		MeanAnomaly     -30
	}
}

