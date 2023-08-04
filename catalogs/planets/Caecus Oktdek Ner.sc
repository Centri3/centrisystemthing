Moon	"Ner/Caecus III II"
{
	ParentBody     "Oktdek"
	Class          "Aquaria"
	Mass            0.008
	Radius          1469.8
	InertiaMoment   0.3808
	Oblateness      0.0019569
	Obliquity       0.1
	EqAscendNode    123.66
	TidalLocked     true

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      1
	BrightnessReal  1

	Surface
	{
		Preset         "caecus_oktdek_ner.cfg"
		SurfStyle       0.994
		Randomize      (0.952, -0.708, 0.215)
		colorDistMagn   0.052585
		colorDistFreq   178.58
		detailScale     128
		drivenDarkening 0
		seaLevel        0.27692
		snowLevel       2
		tropicLatitude  0.037471
		icecapLatitude  2
		icecapHeight    0.12848
		climatePole     0.9375
		climateTropic   0.3125
		climateEquator  0.6875
		climateSteppeMin -1
		climateSteppeMax -1
		climateForestMin -1
		climateForestMax -1
		climateGrassMin  -1
		climateGrassMax  -1
		humidity        0.34779
		heightTempGrad  0.625
		beachWidth      0.00055827
		tropicWidth     0.07
		mainFreq        2.0229
		venusFreq       2
		venusMagn       0.9542
		mareFreq        0.72095
		mareDensity     0.17925
		terraceProb     0.48114
		erosion         0
		montesMagn      0.2
		montesFreq      25
		montesSpiky     1
		montesFraction  1
		dunesMagn       0
		dunesFreq       0
		dunesFraction   0
		hillsMagn       1
		hillsFreq       25
		hillsFraction   1
		hills2Fraction  1
		riversMagn      0
		riversFreq      3.491
		riversSin       7.0884
		riftsMagn       15
		riftsFreq       10
		riftsSin        10
		eqridgeMagn     0.099237
		eqridgeWidth    1
		eqridgeModMagn  1.5649
		eqridgeModFreq  10
		canyonsMagn     0
		canyonsFreq     0
		canyonsFraction 0
		cracksMagn      0.03
		cracksFreq      0.1
		cracksOctaves   15
		craterMagn      0.5
		craterFreq      2
		craterDensity   1
		craterOctaves   30
		craterRayedFactor 0
		volcanoMagn     0.19264
		volcanoFreq     0.619
		volcanoDensity  0.26895
		volcanoOctaves  3
		volcanoActivity 0.20836
		volcanoFlows    0.15051
		volcanoRadius   0.15365
		volcanoTemp     265.66
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		BumpHeight      10
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

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		PeriodDays      3.53840972
		SemiMajorAxisKm 669402.085
		Eccentricity    0.003
		Inclination     0.1
		AscendingNode   123.664122
		ArgOfPericenter 85.1908397
		MeanAnomaly     -96.1832061
	}
}

