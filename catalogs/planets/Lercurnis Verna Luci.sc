Moon	"Luci/Lucernis I I"
{
	ParentBody     "Verna-Luci bar"
	Class          "Carbonia"
	Mass            0.011916
	Radius          1629.4
	InertiaMoment   0.3729
	RotationOffset  -90
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.07
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_verna_luci.cfg"
		SurfStyle       0.9796
		Randomize      (0.822, 0.796, -0.431)
		colorDistMagn   0.073861
		colorDistFreq   233.34
		detailScale     64
		drivenDarkening 0.57252
		seaLevel        0.35115
		snowLevel       2
		tropicLatitude  0.52459
		icecapLatitude  2
		icecapHeight    0
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.1047
		heightTempGrad  0.625
		beachWidth      0.0008729
		tropicWidth     0.07
		mainFreq        1.7122
		venusFreq       0.88453
		venusMagn       0.64885
		mareFreq        0.3
		mareDensity     1
		terraceProb     0.1677
		erosion         0
		montesMagn      0.03
		montesFreq      25
		montesSpiky     0.98609
		montesFraction  1
		dunesMagn       0.038633
		dunesFreq       11.788
		dunesFraction   0.074036
		hillsMagn       0.5
		hillsFreq       50
		hillsFraction   1
		hills2Fraction  1
		riversMagn      61.436
		riversFreq      3.7237
		riversSin       6.7079
		riftsMagn       60.444
		riftsFreq       3.317
		riftsSin        6.4887
		eqridgeMagn     0.36501
		eqridgeWidth    0.022814
		eqridgeModMagn  2.5
		eqridgeModFreq  10
		canyonsMagn     0.5221
		canyonsFreq     0.61076
		canyonsFraction 0.87017
		cracksMagn      0.070864
		cracksFreq      0.6913
		cracksOctaves   0
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   20
		craterRayedFactor 0
		volcanoMagn     0.51908
		volcanoFreq     2
		volcanoDensity  0.099237
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   0.45038
		volcanoTemp     870.23
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      20
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.39877
		RoughnessIce    0.23371
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		TempMapMaxTemp  65536
	}

	NoOcean         true

	NoClouds        true

	NoLava          true

	NoAtmosphere    true

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
		MeanAnomaly     0
	}
}

