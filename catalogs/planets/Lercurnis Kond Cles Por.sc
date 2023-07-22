Moon	"Por/Lercurnis B VIII I"
{
	ParentBody     "Cles"
	Class          "Carbonia"
	Mass            0.00012468
	Radius          351.03
	InertiaMoment   0.3993
	Oblateness      0.0054418
	Obliquity       0
	EqAscendNode    0
	TidalLocked     true

	EndogenousHeating 1450.4
	Albedo          0.04
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "lercurnis_kond_cles_por.cfg"
		SurfStyle       0.50021
		Randomize      (0.419, 0.213, 0.457)
		colorDistMagn   0.054588
		colorDistFreq   40.593
		detailScale     128
		drivenDarkening 0.41985
		seaLevel        0.10631
		snowLevel       2
		tropicLatitude  0
		icecapLatitude  2
		icecapHeight    0.59366
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.21511
		heightTempGrad  0.625
		beachWidth      0.0012036
		tropicWidth     0.07
		mainFreq        0.76336
		venusFreq       0.76336
		venusMagn       0.87786
		mareFreq        5
		mareDensity     0.061069
		terraceProb     0.47463
		erosion         0
		montesMagn      0.2
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0.058241
		dunesFreq       3.3463
		dunesFraction   0.10338
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      15.267
		riversFreq      3.1587
		riversSin       10
		riftsMagn       100
		riftsFreq       10
		riftsSin        10
		eqridgeMagn     0.22901
		eqridgeWidth    1
		eqridgeModMagn  2.5
		eqridgeModFreq  10
		canyonsMagn     0.51387
		canyonsFreq     0.13759
		canyonsFraction 0.027174
		cracksMagn      0.037422
		cracksFreq      0.11273
		cracksOctaves   0
		craterMagn      1
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0
		volcanoFreq     0.9313
		volcanoDensity  0.47328
		volcanoOctaves  5
		volcanoActivity 2
		volcanoFlows    1
		volcanoRadius   1
		volcanoTemp     1900.8
		lavaCoverTidal  1
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      16.358
		SpecBrightWater 0
		SpecBrightIce   0.03
		RoughnessWater  0.35
		RoughnessIce    0.45
		SpecularScale   1
		RoughnessBias   0.8
		Hapke           1
		SpotBright      2.5
		SpotWidth       0.05
		DayAmbient      0.07
		TempMapMaxTemp  76824
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
		PeriodDays      0.660269765
		SemiMajorAxisKm 337261.868
		Eccentricity    0.03
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     5
	}
}

