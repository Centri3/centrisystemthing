Moon	"Le Far/Lercurnis III X"
{
	ParentBody     "Flank"
	Class          "Aquaria"
	Mass            2.68e-05
	Radius          225
	InertiaMoment   0.399
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1
	Color          (0.649 0.480 0.327)

	Surface
	{
		Preset         "aquaria_airless_white2.cfg"
		SurfStyle       0.757
		Randomize      (0.179, 0.282, -0.691)
		colorDistMagn   0.0608
		colorDistFreq   35.4
		detailScale     1.02e+03
		drivenDarkening 0.029
		seaLevel        0.173
		snowLevel       2
		tropicLatitude  0.291
		icecapLatitude  1
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
		humidity        0.301
		heightTempGrad  0.625
		beachWidth      0.00109
		tropicWidth     0.07
		mainFreq        1.77
		venusFreq       1.41
		venusMagn       0
		mareFreq        0
		mareDensity     0.156
		terraceProb     0.373
		erosion         0
		montesMagn      0.0467
		montesFreq      8.45
		montesSpiky     0.906
		montesFraction  0.503
		dunesMagn       0.0345
		dunesFreq       2.05
		dunesFraction   0.925
		hillsMagn       0.123
		hillsFreq       29.6
		hillsFraction   0.542
		hills2Fraction  0.205
		riversMagn      0
		riversFreq      4.19
		riversSin       6.41
		riftsMagn       0
		riftsFreq       2.16
		riftsSin        6.36
		canyonsMagn     0.54
		canyonsFreq     0.0844
		canyonsFraction 0
		cracksMagn      0.0509
		cracksFreq      0.11
		cracksOctaves   0
		craterMagn      1.01
		craterFreq      0.547
		craterDensity   0.823
		craterOctaves   16
		craterRayedFactor 0.197
		volcanoMagn     0.17
		volcanoFreq     0.717
		volcanoDensity  0.196
		volcanoOctaves  3
		volcanoActivity 0
		volcanoFlows    0.243
		volcanoRadius   0.156
		volcanoTemp     146
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      11.3
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.2
		Hapke           0.5
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
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
		PeriodDays      1086.08391
		SemiMajorAxisKm 8934026.93
		Eccentricity    0.0610687023
		Inclination     2
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     0
	}
}

